package com.example.rrmplatform.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "Good")
public class Good {
    public Good(String gName, String gDisc, String gSpec, String gAddress) {
        this.gName = gName;
        this.gDisc = gDisc;
        this.gSpec = gSpec;
        this.gAddress = gAddress;
    }

    @TableId(value = "GId", type = IdType.AUTO)
    private Integer gId;
    @TableField("GName")
    private String gName;
    @TableField("GDiscription")
    private String gDisc;
    @TableField("GSpecialty")
    private String gSpec;
    @TableField("GAddress")
    private String gAddress;


}
