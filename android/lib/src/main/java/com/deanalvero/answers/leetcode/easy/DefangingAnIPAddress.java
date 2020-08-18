package com.deanalvero.answers.leetcode.easy;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
//        return defangIPaddrA(address);
        return defangIPaddrB(address);
    }
    public String defangIPaddrA(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddrB(String address) {
        StringBuilder result = new StringBuilder();

        for (char c: address.toCharArray()) {
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
