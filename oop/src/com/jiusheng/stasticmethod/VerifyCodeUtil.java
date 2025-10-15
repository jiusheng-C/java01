package com.jiusheng.stasticmethod;
// 静态方法掌握工具类

public class VerifyCodeUtil {
    /**
     * 生成指定位数的验证码（包含数字和字母）
     * @param n 验证码位数
     * @return 生成的验证码字符串
     */
    public static String getCode(int n) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 使用 Math.random() 生成随机索引
            int index = (int) (Math.random() * chars.length());
            code.append(chars.charAt(index));
        }

        return code.toString();
    }
}
