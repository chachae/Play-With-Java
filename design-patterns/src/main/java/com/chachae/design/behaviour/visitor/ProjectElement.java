package com.chachae.design.behaviour.visitor;

import java.util.Date;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/25 12:40
 */
public class ProjectElement implements Element {

  private String projectName;
  private String projectContent;
  private String visitorName;
  private Date visitorTime;

  public ProjectElement(String projectName, String visitorName) {
    this.projectName = projectName;
    this.visitorName = visitorName;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectContent() {
    return projectContent;
  }

  public void setProjectContent(String projectContent) {
    this.projectContent = projectContent;
  }

  public String getVisitorName() {
    return visitorName;
  }

  public void setVisitorName(String visitorName) {
    this.visitorName = visitorName;
  }

  public Date getVisitorTime() {
    return visitorTime;
  }

  public void setVisitorTime(Date visitorTime) {
    this.visitorTime = visitorTime;
  }

  public void signature(String visitorName, Date visitorTime) {
    this.visitorName = visitorName;
    this.visitorTime = visitorTime;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
