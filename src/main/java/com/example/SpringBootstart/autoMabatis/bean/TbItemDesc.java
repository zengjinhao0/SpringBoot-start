package com.example.SpringBootstart.autoMabatis.bean;

import java.util.Date;

public class TbItemDesc {
    private Long item_id;

    private Date created;

    private Date updated;

    private String item_desc;

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getItem_desc() {
        return item_desc;
    }

    public void setItem_desc(String item_desc) {
        this.item_desc = item_desc == null ? null : item_desc.trim();
    }
}