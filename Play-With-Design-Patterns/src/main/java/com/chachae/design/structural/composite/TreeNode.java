package com.chachae.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/7/24 15:39
 */
public class TreeNode {

  private String name;
  private String value;
  private final List<TreeNode> children;

  public TreeNode(String name, String value, List<TreeNode> children) {
    this.name = name;
    this.value = value;
    this.children = children;
  }

  public TreeNode(String name, String value) {
    this(name, value, new ArrayList<>());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void add(TreeNode treeNode) {
    children.add(treeNode);
  }

  public void remove(TreeNode treeNode) {
    children.remove(treeNode);
  }

  public List<TreeNode> getChildren() {
    return children;
  }
}
