package com.chachae.leetcode.No_0332;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/reconstruct-itinerary/
 *
 * @author chachae
 * @version v1.0
 * @date 2020/8/22 21:25
 */
class Solution {

  private List<String> res = new ArrayList<>();

  public List<String> findItinerary(List<List<String>> tickets) {
    tickets.sort(new Comparator<List<String>>() {

      @Override
      public int compare(List<String> o1, List<String> o2) {
        int first = compare(o1.get(0), o2.get(0));
        if (first == 0) {
          return compare(o1.get(1), o2.get(1));
        } else {
          return first;
        }
      }

      int compare(String s1, String s2) {
        if (s1.equals(s2)) {
          return 0;
        }
        int i = 0;
        for (; i < s1.length() && i < s2.length(); i++) {
          if (s1.charAt(i) < s2.charAt(i)) {
            return -1;
          } else if (s1.charAt(i) > s2.charAt(i)) {
            return 1;
          }
        }
        return s1.length() < s2.length() ? -1 : 1;
      }
    });

    boolean[] visited = new boolean[tickets.size()];
    for (int i = 0; i < tickets.size(); i++) {
      if (tickets.get(i).get(0).equals("JFK")) {
        LinkedList<String> path = new LinkedList<>();
        visited[i] = true;
        path.addLast(tickets.get(i).get(0));
        path.addLast(tickets.get(i).get(1));
        boolean dfsRes = dfs(tickets, path, 1, visited);
        if (dfsRes) {
          return res;
        } else {
          visited[i] = false;
        }
      }
    }
    return res;
  }

  private boolean dfs(List<List<String>> tickets, LinkedList<String> path, int indexOfLastInsert, boolean[] visited) {

    if (path.size() - 1 == tickets.size()) {
      res = path;
      return true;
    }

    for (int i = 0; i < tickets.size(); i++) {
      if (!visited[i] && tickets.get(i).get(0).equals(path.get(indexOfLastInsert))) {
        visited[i] = true;
        path.add(tickets.get(i).get(1));
        boolean isOk = dfs(tickets, path, ++indexOfLastInsert, visited);
        if (isOk) {
          return true;
        } else {
          --indexOfLastInsert;
          path.removeLast();
          visited[i] = false;
        }
      }
    }
    return false;
  }
}