package net.leay.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author hqweay
 * @since 2020-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Resume implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * UUID
   */
  @TableId(type = IdType.ASSIGN_UUID)
  private String uuid;

  /**
   * 名字
   */
  private String name;

  /**
   * 身份证号
   */
  private String id;

  /**
   * 学校
   */
  private String school;

  /**
   * 简历状态
   */
  private Integer process;

  /**
   * 逻辑删除标识
   */
  @TableField("deleteStatus")
  private Boolean deleteStatus;


}
