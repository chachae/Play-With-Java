package com.chachae.design.behaviour.visitor;

import cn.hutool.json.JSONUtil;
import java.util.Date;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:39
 */
public class CEOVisitor implements Visitor {

  public void visit(ProjectElement projectElement) {
    projectElement.signature("ceo", new Date());
    System.out.println(JSONUtil.toJsonStr(projectElement));
  }

}
