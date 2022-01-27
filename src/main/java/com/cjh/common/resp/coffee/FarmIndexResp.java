package com.cjh.common.resp.coffee;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FarmIndexResp {

    /**
     * errorCode
     */
    private Long errorCode;
    /**
     * errorMessage
     */
    private String errorMessage;
    /**
     * data
     */
    private DataBean data;

    /**
     * DataBean
     */
    @NoArgsConstructor
    @Data
    public static class DataBean {

        /**
         * user
         */
        private UserBean user;
        /**
         * zones
         */
        private List<ZonesBean> zones;
        /**
         * manor
         */
        private ManorBean manor;
        /**
         * land
         */
        private LandBean land;
        /**
         * landTrees
         */
        private Object landTrees;
        /**
         * landOkNums
         */
        private Long landOkNums;
        /**
         * newInitStatus
         */
        private Boolean newInitStatus;
        /**
         * plantTree
         */
        private PlantTreeBean plantTree;
        /**
         * updateSetting
         */
        private Object updateSetting;
        /**
         * userUpdateRecord
         */
        private Object userUpdateRecord;
        /**
         * shareTitle
         */
        private String shareTitle;
        /**
         * shareImg
         */
        private String shareImg;
        /**
         * userPrize
         */
        private Object userPrize;

        /**
         * UserBean
         */
        @NoArgsConstructor
        @Data
        public static class UserBean {

            /**
             * id
             */
            private Long id;
            /**
             * openid
             */
            private String openid;
            /**
             * unionid
             */
            private String unionid;
            /**
             * name
             */
            private String name;
            /**
             * avatar
             */
            private String avatar;
            /**
             * sex
             */
            private Long sex;
            /**
             * mobile
             */
            private String mobile;
            /**
             * credit
             */
            private Long credit;
            /**
             * yunnanStatus
             */
            private Long yunnanStatus;
            /**
             * lotteryStatus
             */
            private Long lotteryStatus;
            /**
             * yunnanActionStatus
             */
            private Long yunnanActionStatus;
            /**
             * status
             */
            private Long status;
            /**
             * coefficient
             */
            private String coefficient;
            /**
             * avatarStatus
             */
            private Long avatarStatus;
            /**
             * messageStatus
             */
            private Long messageStatus;
            /**
             * rememberToken
             */
            private Object rememberToken;
            /**
             * createdAt
             */
            private String createdAt;
            /**
             * updatedAt
             */
            private String updatedAt;
            /**
             * deletedAt
             */
            private Object deletedAt;
            /**
             * firstWeed
             */
            private Long firstWeed;
            /**
             * firstInsect
             */
            private Long firstInsect;
            /**
             * firstTrim
             */
            private Long firstTrim;
            /**
             * freeTree
             */
            private Long freeTree;
            /**
             * runStatus
             */
            private Long runStatus;
            /**
             * qrcode
             */
            private String qrcode;
            /**
             * aidounumber
             */
            private Object aidounumber;
            /**
             * isSow
             */
            private Long isSow;
            /**
             * authStatus
             */
            private Long authStatus;
            /**
             * progress
             */
            private Long progress;
            /**
             * propStatus
             */
            private Long propStatus;
        }

        /**
         * ManorBean
         */
        @NoArgsConstructor
        @Data
        public static class ManorBean {

            /**
             * id
             */
            private Long id;
            /**
             * userId
             */
            private Long userId;
            /**
             * zoneId
             */
            private Long zoneId;
            /**
             * name
             */
            private String name;
            /**
             * nameTime
             */
            private String nameTime;
            /**
             * openTime
             */
            private String openTime;
            /**
             * isDone
             */
            private Long isDone;
            /**
             * createdAt
             */
            private String createdAt;
            /**
             * updatedAt
             */
            private String updatedAt;
            /**
             * deletedAt
             */
            private Object deletedAt;
        }

        /**
         * LandBean
         */
        @NoArgsConstructor
        @Data
        public static class LandBean {

            /**
             * id
             */
            private Long id;
            /**
             * userId
             */
            private Long userId;
            /**
             * zoneId
             */
            private Long zoneId;
            /**
             * manorId
             */
            private Long manorId;
            /**
             * seedId
             */
            private Long seedId;
            /**
             * levelId
             */
            private Long levelId;
            /**
             * isDone
             */
            private Long isDone;
            /**
             * seedTime
             */
            private String seedTime;
            /**
             * progress
             */
            private Long progress;
            /**
             * createdAt
             */
            private String createdAt;
            /**
             * updatedAt
             */
            private String updatedAt;
            /**
             * deletedAt
             */
            private Object deletedAt;
            /**
             * level
             */
            private LevelBean level;

            /**
             * LevelBean
             */
            @NoArgsConstructor
            @Data
            public static class LevelBean {

                /**
                 * id
                 */
                private Long id;
                /**
                 * name
                 */
                private String name;
                /**
                 * level
                 */
                private Long level;
                /**
                 * progress
                 */
                private String progress;
                /**
                 * createdAt
                 */
                private Object createdAt;
                /**
                 * updatedAt
                 */
                private Object updatedAt;
                /**
                 * image
                 */
                private Object image;
                /**
                 * desOne
                 */
                private Object desOne;
                /**
                 * desTwo
                 */
                private Object desTwo;
                /**
                 * btnTitle
                 */
                private Object btnTitle;
            }
        }

        /**
         * PlantTreeBean
         */
        @NoArgsConstructor
        @Data
        public static class PlantTreeBean {

            /**
             * id
             */
            private Long id;
        }

        /**
         * ZonesBean
         */
        @NoArgsConstructor
        @Data
        public static class ZonesBean {

            /**
             * id
             */
            private Long id;
            /**
             * name
             */
            private String name;
            /**
             * title
             */
            private String title;
            /**
             * isOpen
             */
            private Long isOpen;
            /**
             * allowCount
             */
            private Long allowCount;
            /**
             * downCount
             */
            private Long downCount;
            /**
             * landNum
             */
            private String landNum;
            /**
             * userNum
             */
            private String userNum;
            /**
             * panoramaImg
             */
            private Object panoramaImg;
            /**
             * thumbImg
             */
            private String thumbImg;
            /**
             * headerImg
             */
            private String headerImg;
            /**
             * backText
             */
            private String backText;
            /**
             * backImg
             */
            private String backImg;
            /**
             * address
             */
            private String address;
            /**
             * area
             */
            private String area;
            /**
             * displayorder
             */
            private Long displayorder;
            /**
             * createdAt
             */
            private Object createdAt;
            /**
             * updatedAt
             */
            private String updatedAt;
            /**
             * deletedAt
             */
            private Object deletedAt;
        }
    }
}
