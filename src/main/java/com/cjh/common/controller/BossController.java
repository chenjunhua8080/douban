package com.cjh.common.controller;

import com.cjh.common.boss.EmailService;
import com.cjh.common.dao.BindFarmDao;
import com.cjh.common.enums.PlatformEnum;
import com.cjh.common.feign.CloudFeignClient;
import com.cjh.common.po.BindFarmPO;
import com.cjh.common.service.ReqLogService;
import java.util.HashMap;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class BossController {

    @Autowired
    private final CloudFeignClient cloudFeignClient;
    @Autowired
    private final BindFarmDao bindFarmDao;
    @Autowired
    private final ReqLogService reqLogService;

    @GetMapping("/getResumeZip")
    public Map<String, Object> getHomeData(@RequestParam("openId") String openId) {
        Map<String, Object> map = new HashMap<>();
        String msg = null;
        BindFarmPO bindFarm = bindFarmDao.selectByOpenId(openId, PlatformEnum.BOSS_EMAIL.getCode());
        if (bindFarm == null) {
            msg = cloudFeignClient.pushErrorMsg(openId, "您还未绑定下载简历的邮箱！");
        }
        try {
            String[] cookie = bindFarm.getCookie().split(";");
            map = EmailService.getResumeZip(cookie[0], cookie[1]);
        } catch (Exception e) {
            e.printStackTrace();
            msg = "下载简历失败：" + e.getMessage();
            cloudFeignClient.pushErrorMsg(openId, msg);
        }
        map.put("msg", msg);

        reqLogService.addLog(PlatformEnum.JD_CAKE.getCode(), openId, String.valueOf(map), null);

        return map;
    }

}
