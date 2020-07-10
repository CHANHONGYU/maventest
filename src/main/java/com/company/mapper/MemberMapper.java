package com.company.mapper;

import com.company.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
/**
 * 通过手机号或者用户名查看自己信息
 **/
   Member selectByNameOrPhone (@Param("username") String username,@Param("phone")String phone);
/**
 * 通过用户名修改头像或者密码
 */
    int updatePwOrIconByMid(@Param("mid") int mid, @Param("newPw") String newPw,@Param("newIcon") String newIcon);

    /**
     * 注册*/
    int register(@Param("member")Member member);


 }