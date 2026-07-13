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
@TableName(value = "Heritage")
public class Heritage {
    @TableId(value = "HId", type = IdType.AUTO)
    private Integer hId;
    @TableField("HName")
    private String hName;
    @TableField("HHistory")
    private String hHistory;
    @TableField("HAddress")
    private String hAddress;

    public Heritage(String hName, String hHistory, String hAddress) {
        this.hName = hName;
        this.hHistory = hHistory;
        this.hAddress = hAddress;
    }
}
