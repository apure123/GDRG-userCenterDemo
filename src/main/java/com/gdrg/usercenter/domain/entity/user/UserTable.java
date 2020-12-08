package com.gdrg.usercenter.domain.entity.user;

import javax.persistence.*;

@Table(name = "user_table")
public class UserTable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String username;

    @Column(name = "wx_id")
    private String wxId;

    private Integer bonus;

    @Column(name = "avatar_url")
    private String avatarUrl;

    private String roles;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return wx_id
     */
    public String getWxId() {
        return wxId;
    }

    /**
     * @param wxId
     */
    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    /**
     * @return bonus
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * @param bonus
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * @return avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return roles
     */
    public String getRoles() {
        return roles;
    }

    /**
     * @param roles
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }
}