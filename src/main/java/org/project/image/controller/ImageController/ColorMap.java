package org.project.image.controller.ImageController;

//数据字典

import java.util.HashMap;
import java.util.Map;

public class ColorMap {
    public static final Map<String, String> colorMaps = new HashMap<>();
    public static final String  colorString =
            "000 黑白," + "011 黑白," + "110 黑白," + "001 黑白," + "100 黑白," +
            "111 黑白," + "101 黑白," + "010 黑白," + "554 黑白," + "555 黑白," +
            "545 黑白," + "222 黑白," + "333 黑白," + "444 黑白," +

            "544 粉色," + "533 粉色," + "534 粉色," + "523 粉色," + "535 粉色," +
            "524 粉色," + "513 粉色," + "525 粉色," + "514 粉色," + "503 粉色," +
            "515 粉色," + "504 粉色," +

            "200 红色," + "310 红色," + "201 红色," + "300 红色," + "311 红色," +
            "410 红色," + "520 红色," + "202 红色," + "301 红色," + "400 红色," +
            "411 红色," + "510 红色," + "312 红色," + "521 红色," + "401 红色," +
            "500 红色," + "511 红色," + "302 红色," + "412 红色," + "522 红色," +
            "501 红色," + "402 红色," + "512 红色," + "502 红色," +

            "440 橙色," + "430 橙色," + "441 橙色," + "420 橙色," + "431 橙色," +
            "530 橙色," + "442 橙色," + "421 橙色," + "432 橙色," + "531 橙色," +
            "422 橙色," + "532 橙色," +

            "550 黄色," + "540 黄色," + "551 黄色," + "541 黄色," + "552 黄色," +
            "542 黄色," + "553 黄色," + "543 黄色," +

            "130 青色," + "230 青色," + "054 青色," + "131 青色," + "033 青色," +
            "231 青色," + "055 青色," + "132 青色," + "154 青色," + "133 青色," +
            "232 青色," + "155 青色," + "233 青色," + "255 青色," + "355 青色," +
            "455 青色," + "140 青色," + "141 青色," + "120 青色," + "043 青色," +
            "142 青色," + "044 青色," + "121 青色," + "143 青色," + "122 青色," +
            "144 青色," + "045 青色," + "225 青色," +

            "050 绿色," + "150 绿色," + "051 绿色," + "030 绿色," + "250 绿色," +
            "151 绿色," + "052 绿色," + "031 绿色," + "251 绿色," + "152 绿色," +
            "053 绿色," + "350 绿色," + "032 绿色," + "252 绿色," + "153 绿色," +
            "450 绿色," + "351 绿色," + "253 绿色," + "451 绿色," + "352 绿色," +
            "254 绿色," + "452 绿色," + "353 绿色," + "453 绿色," + "354 绿色," +
            "454 绿色," + "040 绿色," + "041 绿色," + "020 绿色," + "240 绿色," +
            "042 绿色," + "340 绿色," + "021 绿色," + "241 绿色," + "341 绿色," +
            "022 绿色," + "242 绿色," + "342 绿色," + "243 绿色," + "343 绿色," +

            "012 蓝色," + "034 蓝色," + "013 蓝色," + "112 蓝色," + "035 蓝色," +
            "134 蓝色," + "113 蓝色," + "014 蓝色," + "135 蓝色," + "234 蓝色," +
            "015 蓝色," + "114 蓝色," + "235 蓝色," + "115 蓝色," + "023 蓝色," +
            "002 蓝色," + "024 蓝色," + "123 蓝色," + "244 蓝色," + "145 蓝色," +
            "003 蓝色," + "102 蓝色," + "025 蓝色," + "124 蓝色," + "344 蓝色," +
            "245 蓝色," + "223 蓝色," + "103 蓝色," + "004 蓝色," + "125 蓝色," +
            "345 蓝色," + "224 蓝色," + "005 蓝色," + "104 蓝色," + "105 蓝色," +

            "212 紫色," + "213 紫色," + "334 紫色," + "214 紫色," + "313 紫色," +
            "335 紫色," + "434 紫色," + "215 紫色," + "314 紫色," + "413 紫色," +
            "435 紫色," + "315 紫色," + "414 紫色," + "415 紫色," + "323 紫色," +
            "203 紫色," + "324 紫色," + "423 紫色," + "445 紫色," + "204 紫色," +
            "303 紫色," + "325 紫色," + "424 紫色," + "205 紫色," + "304 紫色," +
            "403 紫色," + "425 紫色," + "305 紫色," + "404 紫色," + "405 紫色," +
            "505 紫色," +

            "220 棕色," + "330 棕色," + "210 棕色," + "221 棕色," + "320 棕色," +
            "331 棕色," + "211 棕色," + "321 棕色," + "332 棕色," + "322 棕色," +
            "443 棕色," + "433 棕色 ";

    public static Map<String, String> getColorMap() {
//        String colorString =
//        System.out.println(colorString);

        if (colorMaps.size() == 0) {
            String[] split = colorString.split( "," );
            for (String colorMap : split) {
                String[] codeAndName = colorMap.split( " " );
                colorMaps.put( codeAndName[0],codeAndName[1] );
            }
        }
        return colorMaps;
    }


//    public static final String  colorString =
//            "000 黑色," +
//                    "011 黑色," +
//                    "110 黑色," +
//                    "001 黑色," +
//                    "100 黑色," +
//                    "111 黑色," +
//                    "101 黑色," +
//                    "010 黑色," +
//                    "544 浅粉色," +
//                    "533 粉色," +
//                    "534 浅粉色," +
//                    "523 粉色," +
//                    "535 浅粉色," +
//                    "524 粉色," +
//                    "513 深粉色," +
//                    "525 粉色," +
//                    "514 深粉色," +
//                    "503 深粉色," +
//                    "515 深粉色," +
//                    "504 深粉色," +
//                    "554 白色," +
//                    "555 白色," +
//                    "545 白色," +
//                    "222 灰色," +
//                    "333 灰色," +
//                    "444 灰色," +
//                    "200 深红色," +
//                    "310 深红色," +
//                    "201 深红色," +
//                    "300 深红色," +
//                    "311 深红色," +
//                    "410 红色," +
//                    "520 浅红色," +
//                    "202 深红色," +
//                    "301 深红色," +
//                    "400 红色," +
//                    "411 红色," +
//                    "510 红色," +
//                    "312 浅红色," +
//                    "521 浅红色," +
//                    "401 红色," +
//                    "500 红色," +
//                    "511 红色," +
//                    "302 浅红色," +
//                    "412 浅红色," +
//                    "522 浅红色," +
//                    "501 红色," +
//                    "402 浅红色," +
//                    "512 浅红色," +
//                    "502 浅红色," +
//                    "440 浅橙色," +
//                    "430 深橙色," +
//                    "441 浅橙色," +
//                    "420 深橙色," +
//                    "431 深橙色," +
//                    "530 橙色," +
//                    "442 浅橙色," +
//                    "421 深橙色," +
//                    "432 深橙色," +
//                    "531 橙色," +
//                    "422 深橙色," +
//                    "532 橙色," +
//                    "550 黄色," +
//                    "540 深黄色," +
//                    "551 黄色," +
//                    "541 深黄色," +
//                    "552 浅黄色," +
//                    "542 深黄色," +
//                    "553 浅黄色," +
//                    "543 浅黄色," +
//                    "130 青色," +
//                    "230 深青色," +
//                    "054 青色," +
//                    "131 青色," +
//                    "033 深青色," +
//                    "231 深青色," +
//                    "055 青色," +
//                    "132 青色," +
//                    "154 浅青色," +
//                    "133 深青色," +
//                    "232 深青色," +
//                    "155 浅青色," +
//                    "233 深青色," +
//                    "255 浅青色," +
//                    "355 浅青色," +
//                    "455 浅青色," +
//                    "140 青色," +
//                    "141 青色," +
//                    "120 深青色," +
//                    "043 青色," +
//                    "142 青色," +
//                    "044 深青色," +
//                    "121 深青色," +
//                    "143 深青色," +
//                    "122 深青色," +
//                    "144 深青色," +
//                    "045 青色," +
//                    "225 深青色," +
//                    "050 绿色," +
//                    "150 绿色," +
//                    "051 绿色," +
//                    "030 深绿色," +
//                    "250 绿色," +
//                    "151 绿色," +
//                    "052 绿色," +
//                    "031 深绿色," +
//                    "251 绿色," +
//                    "152 绿色," +
//                    "053 绿色," +
//                    "350 浅绿色," +
//                    "032 深绿色," +
//                    "252 绿色," +
//                    "153 绿色," +
//                    "450 浅绿色," +
//                    "351 浅绿色," +
//                    "253 绿色," +
//                    "451 浅绿色," +
//                    "352 浅绿色," +
//                    "254 绿色," +
//                    "452 浅绿色," +
//                    "353 浅绿色," +
//                    "453 浅绿色," +
//                    "354 浅绿色," +
//                    "454 浅绿色," +
//                    "040 绿色," +
//                    "041 绿色," +
//                    "020 深绿色," +
//                    "240 绿色," +
//                    "042 绿色," +
//                    "340 深绿色," +
//                    "021 深绿色," +
//                    "241 绿色," +
//                    "341 深绿色," +
//                    "022 深绿色," +
//                    "242 绿色," +
//                    "342 深绿色," +
//                    "243 绿色," +
//                    "343 深绿色," +
//                    "012 深蓝色," +
//                    "034 浅蓝色," +
//                    "013 深蓝色," +
//                    "112 深蓝色," +
//                    "035 浅蓝色," +
//                    "134 浅蓝色," +
//                    "113 深蓝色," +
//                    "014 蓝色," +
//                    "135 浅蓝色," +
//                    "234 浅蓝色," +
//                    "015 蓝色," +
//                    "114 蓝色," +
//                    "235 浅蓝色," +
//                    "115 蓝色," +
//                    "023 深蓝色," +
//                    "002 深蓝色," +
//                    "024 蓝色," +
//                    "123 蓝色," +
//                    "244 浅蓝色," +
//                    "145 浅蓝色," +
//                    "003 深蓝色," +
//                    "102 深蓝色," +
//                    "025 蓝色," +
//                    "124 蓝色," +
//                    "344 浅蓝色," +
//                    "245 浅蓝色," +
//                    "223 浅蓝色," +
//                    "103 深蓝色," +
//                    "004 蓝色," +
//                    "125 蓝色," +
//                    "345 浅蓝色," +
//                    "224 浅蓝色," +
//                    "005 蓝色," +
//                    "104 蓝色," +
//                    "105 蓝色," +
//                    "212 深紫色," +
//                    "213 深紫色," +
//                    "334 浅紫色," +
//                    "214 深紫色," +
//                    "313 紫色," +
//                    "335 浅紫色," +
//                    "434 浅紫色," +
//                    "215 深紫色," +
//                    "314 紫色," +
//                    "413 紫色," +
//                    "435 浅紫色," +
//                    "315 紫色," +
//                    "414 紫色," +
//                    "415 紫色," +
//                    "323 浅紫色," +
//                    "203 深紫色," +
//                    "324 浅紫色," +
//                    "423 浅紫色," +
//                    "445 浅紫色," +
//                    "204 深紫色," +
//                    "303 紫色," +
//                    "325 浅紫色," +
//                    "424 浅紫色," +
//                    "205 深紫色," +
//                    "304 紫色," +
//                    "403 紫色," +
//                    "425 浅紫色," +
//                    "305 紫色," +
//                    "404 紫色," +
//                    "405 紫色," +
//                    "505 紫色," +
//                    "220 深棕色," +
//                    "330 浅棕色," +
//                    "210 深棕色," +
//                    "221 深棕色," +
//                    "320 棕色," +
//                    "331 浅棕色," +
//                    "211 深棕色," +
//                    "321 棕色," +
//                    "332 浅棕色," +
//                    "322 棕色," +
//                    "443 浅棕色," +
//                    "433 浅棕色 ";
}

