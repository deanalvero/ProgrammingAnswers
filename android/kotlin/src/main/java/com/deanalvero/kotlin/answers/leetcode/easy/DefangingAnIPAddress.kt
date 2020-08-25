package com.deanalvero.kotlin.answers.leetcode.easy

class DefangingAnIPAddress {

    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]", false)
    }
}