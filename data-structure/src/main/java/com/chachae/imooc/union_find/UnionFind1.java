package com.chachae.imooc.union_find;

/**
 * 并查集 version_1
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/8 14:47
 */
public class UnionFind1 implements UF {

  private final int[] ids;

  public UnionFind1(int size) {
    ids = new int[size];
    for (int i = 0; i < ids.length; i++) {
      ids[i] = i;
    }
  }

  @Override
  public int getSize() {
    return ids.length;
  }

  @Override
  public boolean isConnected(int p, int q) {
    return find(p) == find(q);
  }

  /**
   * 合并，时间复杂度：O(n)
   */
  @Override
  public void unionElements(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if (pid == qid) {
      return;
    }
    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == pid) {
        ids[i] = qid;
      }
    }
  }

  private int find(int id) {
    if (id < 0 || id > getSize() - 1) {
      throw new IllegalArgumentException("索引异常");
    }
    return ids[id];
  }
}
