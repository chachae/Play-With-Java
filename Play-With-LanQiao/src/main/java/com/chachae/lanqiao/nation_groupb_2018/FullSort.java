package com.chachae.lanqiao.nation_groupb_2018;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.i18n.SimpleTimeZoneAwareLocaleContext;

/**
 * @author chachae
 * @version v1.0
 * @date 2020/11/13 22:06
 */
public class FullSort {

  private static boolean[] vis = new boolean[3];

  public static void main(String[] args) {
    dfs(0,3,new ArrayList<>());
  }

  private static void dfs(int start,int end, List<Integer> list){
    if( list.size() == 3 ){
      System.out.println(list);
      return;
    }
    if( list.size() > 3 ){
      return;
    }

    for (int i = 0; i < 3; i++) {
      if( !vis[i] ){
        vis[i] = true;
        list.add(i);
        dfs(i+1,end,list);
        list.remove(list.size() - 1);
        vis[i] = false;
      }
    }
  }
}
