package com.piggsoft.restful.user.service.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author piggsoft
 * @since 2019-04-06
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nickname;

    private LocalDateTime birthday;

    @TableLogic
    private String isDelete;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", nickname=" + nickname +
        ", birthday=" + birthday +
        ", isDelete=" + isDelete +
        ", phone=" + phone +
        "}";
    }
}
