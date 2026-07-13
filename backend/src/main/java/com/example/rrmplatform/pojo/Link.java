package com.example.rrmplatform.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "Link")
public class Link {
    @MppMultiId
    @TableField("LId")
    private Integer lId;
    @MppMultiId
    @TableField("GId")
    private Integer gId;
    @TableField("LName")
    private String lName;
    @TableField("LInfo")
    private String lInfo;
    @TableField("Link")
    private String link;
    @TableField("LScore")
    private Integer lScore;

}
