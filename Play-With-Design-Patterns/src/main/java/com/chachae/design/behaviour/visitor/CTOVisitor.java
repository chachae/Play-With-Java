package com.chachae.design.behaviour.visitor;

import cn.hutool.json.JSONUtil;
import java.util.Date;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:39
 */
public class CTOVisitor implements Visitor {

  public void visit(ProjectElement projectElement) {
    projectElement.signature("cto", new Date());
    System.out.println(JSONUtil.toJsonStr(projectElement));
  }

}
