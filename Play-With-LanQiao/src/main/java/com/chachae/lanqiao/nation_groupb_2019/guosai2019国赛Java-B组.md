### 2019国赛Java-B组

1.  52800

```java
package guoSai_2019_10th;

import java.util.Scanner;

/**
 * 1、递增序列
 * 本题总分：5 分
 * <p>
 * 【问题描述】
 * 对于一个字母矩阵，我们称矩阵中的一个递增序列是指在矩阵中找到两个字母，它们在同一行，同一列，
 * 或者在同一 45 度的斜线上，这两个字母从左向右看、或者从上向下看是递增的。
 * 例如，如下矩阵中
 * LANN
 * QIAO
 * 有LN、LN、AN、AN、IO、AO、
 * LQ、AI、NO、
 * NO、
 * AQ、IN、AN 等 13 个递增序列。
 * 注意当两个字母是从左下到右上排列时，从左向右看和从上向下看是不同的顺序。
 * 对于下面的 30 行 50 列的矩阵，请问总共有多少个递增序列？（如果你把
 * 以下文字复制到文本文件中，请务必检查复制的内容是否与文档中的一致。在
 * 试题目录下有一个文件 inc.txt，内容与下面的文本相同）
 * <p>
 * VLPWJVVNNZSWFGHSFRBCOIJTPYNEURPIGKQGPSXUGNELGRVZAG
 * SDLLOVGRTWEYZKKXNKIRWGZWXWRHKXFASATDWZAPZRNHTNNGQF
 * ZGUGXVQDQAEAHOQEADMWWXFBXECKAVIGPTKTTQFWSWPKRPSMGA
 * BDGMGYHAOPPRRHKYZCMFZEDELCALTBSWNTAODXYVHQNDASUFRL
 * YVYWQZUTEPFSFXLTZBMBQETXGXFUEBHGMJKBPNIHMYOELYZIKH
 * ZYZHSLTCGNANNXTUJGBYKUOJMGOGRDPKEUGVHNZJZHDUNRERBU
 * XFPTZKTPVQPJEMBHNTUBSMIYEGXNWQSBZMHMDRZZMJPZQTCWLR
 * ZNXOKBITTPSHEXWHZXFLWEMPZTBVNKNYSHCIQRIKQHFRAYWOPG
 * MHJKFYYBQSDPOVJICWWGGCOZSBGLSOXOFDAADZYEOBKDDTMQPA
 * VIDPIGELBYMEVQLASLQRUKMXSEWGHRSFVXOMHSJWWXHIBCGVIF
 * GWRFRFLHAMYWYZOIQODBIHHRIIMWJWJGYPFAHZZWJKRGOISUJC
 * EKQKKPNEYCBWOQHTYFHHQZRLFNDOVXTWASSQWXKBIVTKTUIASK
 * PEKNJFIVBKOZUEPPHIWLUBFUDWPIDRJKAZVJKPBRHCRMGNMFWW
 * CGZAXHXPDELTACGUWBXWNNZNDQYYCIQRJCULIEBQBLLMJEUSZP
 * RWHHQMBIJWTQPUFNAESPZHAQARNIDUCRYQAZMNVRVZUJOZUDGS
 * PFGAYBDEECHUXFUZIKAXYDFWJNSAOPJYWUIEJSCORRBVQHCHMR
 * JNVIPVEMQSHCCAXMWEFSYIGFPIXNIDXOTXTNBCHSHUZGKXFECL
 * YZBAIIOTWLREPZISBGJLQDALKZUKEQMKLDIPXJEPENEIPWFDLP
 * HBQKWJFLSEXVILKYPNSWUZLDCRTAYUUPEITQJEITZRQMMAQNLN
 * DQDJGOWMBFKAIGWEAJOISPFPLULIWVVALLIIHBGEZLGRHRCKGF
 * LXYPCVPNUKSWCCGXEYTEBAWRLWDWNHHNNNWQNIIBUCGUJYMRYW
 * CZDKISKUSBPFHVGSAVJBDMNPSDKFRXVVPLVAQUGVUJEXSZFGFQ
 * IYIJGISUANRAXTGQLAVFMQTICKQAHLEBGHAVOVVPEXIMLFWIYI
 * ZIIFSOPCMAWCBPKWZBUQPQLGSNIBFADUUJJHPAIUVVNWNWKDZB
 * HGTEEIISFGIUEUOWXVTPJDVACYQYFQUCXOXOSSMXLZDQESHXKP
 * FEBZHJAGIFGXSMRDKGONGELOALLSYDVILRWAPXXBPOOSWZNEAS
 * VJGMAOFLGYIFLJTEKDNIWHJAABCASFMAKIENSYIZZSLRSUIPCJ
 * BMQGMPDRCPGWKTPLOTAINXZAAJWCPUJHPOUYWNWHZAKCDMZDSR
 * RRARTVHZYYCEDXJQNQAINQVDJCZCZLCQWQQIKUYMYMOVMNCBVY
 * ABTCRRUXVGYLZILFLOFYVWFFBZNFWDZOADRDCLIRFKBFBHMAXX
 * <p>
 * 【答案提交】
 * 这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一
 * 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:30
 */
public class No1_递增序列 {
    static Scanner sc = new Scanner(System.in);
    //static int n = 3;
    static int n = 30;
    //static int m = 4;
    static int m = 50;
    static char[][] data = new char[n][m];
    static int ans;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextLine().toCharArray();
        }

        // 横
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int z = j + 1; z < m; z++) {
                    if (data[i][j] < data[i][z]) {
                        System.out.print(data[i][j] + "" + data[i][z] + " ");
                        ans++;
                    }
                }
            }
        }
        System.out.println();

        // 竖
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                    if (data[j][i] < data[z][i]) {
                        System.out.print(data[j][i] + "" + data[z][i] + " ");
                        ans++;
                    }
                }
            }
        }
        System.out.println();

        // \斜
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i + 1; j < n; j++) {
                k++;
                // 第1行和第3行有差别的增值有问题
                for (int z = 0; z < m; z++) {
                    if (z + k < m) {
                        if (data[i][z] < data[j][z + k]) {
                            System.out.println("\\斜:[(" + i + "," + z + ");(" + j + "," + (z + k) + ")  " + data[i][z] + "" + data[j][z + k] + " ");
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println();

        // /斜
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i + 1; j < n; j++) {
                k++;
                // 第1行和第3行有差别的增值有问题
                for (int z = 1; z < m; z++) {
                    if (z - k >= 0) {
                        if (data[i][z] > data[j][z - k]) {
                            System.out.println("/斜1:[(" + j + "," + (z - k) + ");(" + i + "," + z + ")  " + data[j][z - k] + "" + data[i][z] + " ");
                            ans++;
                        }
                        if (data[i][z] < data[j][z - k]) {
                            System.out.println("/斜2:[(" + i + "," + z + ");(" + j + "," + (z - k) + ")  " + data[i][z] + "" + data[j][z - k] + " ");
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("ans==>" + ans);
    }
}
```

2.  26287

```java
package guoSai_2019_10th;

import java.util.*;

/**
 * 2、平方拆分
 * 本题总分：5 分
 * <p>
 * 【问题描述】
 * 将 2019 拆分为若干个两两不同的完全平方数之和，一共有多少种不同的方法？
 * 注意交换顺序视为同一种方法，例如 132 + 252 + 352 = 2019 与 132 + 352 + 252 = 2019 视为同一种方法。
 * 【答案提交】
 * 这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:32
 */
public class No2_平方拆分 {

    static List<List<Integer>> listA = new LinkedList<>();
    static int[] ping = new int[45];

    public static void main(String[] args) {
        dfs(2019, 1, 45);
        System.out.println(sum);
    }

    static int sum;

    /**
     * 深搜平方和为2019的所有子集
     */
    private static void dfs(int num, int min, int max) {
        if (num < 0) {
            return;
        }
        if (num == 0) {
            sum++;
            return;
        }
        for (int i = min; i < max; i++) {
            //去重，保证下一位数字一定大于当前数字
            dfs(num - i * i, i + 1, max);
        }
    }

    //public static void main(String[] args) {
    //    for (int i = 1; i < 45; i++) {
    //        ping[i] = i * i;
    //    }
    //    System.out.println(Arrays.toString(ping));
    //    int ans = 0;
    //    for (int i = 1; i < 45; i++) {
    //        ans += ping[i];
    //        if (ans > 2019) {
    //            System.out.println(ans);
    //            System.out.println(i);
    //            break;
    //        }
    //    }
    //    //for (int k = 3; k < 5; k++) {
    //    //    f(k, 1, 0, new ArrayList<>());
    //    //}
    //    dfs(18, 1, 0, new ArrayList<>());
    //    listA.sort(new Comparator<List<Integer>>() {
    //        @Override
    //        public int compare(List<Integer> o1, List<Integer> o2) {
    //            return o1.size() - o2.size();
    //        }
    //    });
    //
    //    for (List<Integer> list : listA) {
    //        System.out.println(list);
    //    }
    //    System.out.println(listA.size());
    //}

    public static void dfs(int k, int index, int sum, List<Integer> list) {
        if (sum > 2019) {
            return;
        }
        if (index == 45 || k == 0) {
            if (sum == 2019) {
                listA.add(new ArrayList<>(list));
                System.out.println(list);
            }
            return;
        }
        // 取
        list.add(ping[index]);
        dfs(k - 1, index + 1, sum + ping[index], list);
        list.remove(list.size() - 1);

        // 不取
        dfs(k, index + 1, sum, list);
    }
}
```

3. 

```java

```



4. 

```java

```



5.  292809912969721375

```java
package guoSai_2019_10th;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 5、序列求和
 * 本题总分：15 分
 * <p>
 * 【问题描述】
 * 学习了约数后，小明对于约数很好奇，他发现，给定一个正整数 t，总是可以找到含有 t 个约数的整数。
 * 小明对于含有 t 个约数的最小数非常感兴趣，并把它定义为 St 。
 * 例如 S1 = 1, S2 = 2, S3 = 4, S4 = 6，· · · 。
 * 现在小明想知道，前 60 个 Si 的和是多少？即 S1 + S2 + · · · + S60 是多少？
 * 【答案提交】
 * 这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:37
 */
public class No5_序列求和 {

    public static void main(String[] args) {
        List<Integer> primeNums = new ArrayList<>();
        //将100以内的质数存入
        for (int i = 2; i < 100; i++) {
            if (judge(i)) {
                primeNums.add(i);
            }
        }

        long sum = 0;
        for (int i = 1; i <= 60; i++) {
            //对于某个数的质因数一定是2^a * 3^b * 5^c......
            //因数个数=(a+1)*(b+1)*(c+1)......
            //保持因数个数不变，若使这个数最小，一定是a>b>c......
            //比如将12分解质因数[2,2,3],从大到小排序[3,2,2];
            //因此有12个因数的最小数字一定是2^(3-1) * 3^(2-1) * 5^(2-1)=60
            List<Integer> list = decNum(i);
            long num = 1;
            for (int j = 0; j < list.size(); j++) {
                num *= Math.pow(primeNums.get(j), list.get(j) - 1);
            }
            sum += num;
            //System.out.println("Num [约数个数=" + i + ", num=" + num + "]");
        }
        System.out.println("总和：" + sum);
    }

    /**
     * 判断质数
     */
    private static boolean judge(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 分解质因数
     */
    private static List<Integer> decNum(int num) {
        LinkedList<Integer> res = new LinkedList<>();
        int k = 2;
        while (num > 1) {
            if (num % k == 0) {
                num /= k;
                res.addFirst(k);
            } else {
                k++;
            }
        }
        return res;
    }
}
```



6. 

```java
package guoSai_2019_10th;

import java.util.Scanner;

/**
 * 6、最长子序列
 * 本题总分：15 分
 * <p>
 * 【问题描述】
 * 我们称一个字符串 S 包含字符串 T 是指 T 是 S 的一个子序列，即可以从字符串 S 中抽出若干个字符，
 * 它们按原来的顺序组合成一个新的字符串与 T 完全一样。
 * 给定两个字符串 S 和 T，请问 T 中从第一个字符开始最长连续多少个字符被 S 包含？
 * 【输入格式】
 * 输入两行，每行一个字符串。第一行的字符串为 S，第二行的字符串为 T。
 * 两个字符串均非空而且只包含大写英文字母。
 * 【输出格式】
 * 输出一个整数，表示答案。
 * 【样例输入】
 * ABCDEABCD
 * AABZ
 * 【样例输出】
 * 3
 * 【评测用例规模与约定】
 * 对于 20% 的评测用例，1 ≤ |T| ≤ |S | ≤ 20；
 * 对于 40% 的评测用例，1 ≤ |T| ≤ |S | ≤ 100；
 * 对于所有评测用例，1 ≤ |T| ≤ |S | ≤ 1000。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:37
 */
public class No6_最长子序列 {
    static Scanner sc = new Scanner(System.in);
    static String S;
    static String T;
    static int ans;

    public static void main(String[] args) {
        S = sc.nextLine();
        T = sc.nextLine();
        int sLen = S.length();
        int tLen = T.length();

        int l = 0;
        int r = 0;
        int index = 0;
        while (l < sLen) {
            while (r < sLen && index < tLen) {
                if (S.charAt(r) == T.charAt(index)) {
                    r++;
                    index++;
                } else {
                    r++;
                }
            }
            l = r;
            ans = Math.max(ans, index);
        }
        System.out.println(ans);
    }
}
```

7. 

```java
package guoSai_2019_10th;

import java.util.Scanner;

/**
 * 7、数正方形
 * 本题总分：20 分
 * <p>
 * 【问题描述】
 * 在一个 N × N 的点阵上，取其中 4 个点恰好组成一个正方形的 4 个顶点，一共有多少种不同的取法？
 * 由于结果可能非常大，你只需要输出模 109 + 7 的余数。
 * 如上图所示的正方形都是合法的。
 * 【输入格式】
 * 输入包含一个整数 N。
 * 【输出格式】
 * 输出一个整数代表答案。
 * 【样例输入】
 * 4
 * 【样例输出】
 * 20
 * 【数据规模与约定】
 * 对于所有评测用例，2 ≤ N ≤ 1000000。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:38
 */
public class No7_数正方形 {
    static Scanner sc = new Scanner(System.in);
    static final int mod = 1000000007;

    public static void main(String[] args) {
        long n = sc.nextInt();
        long res = ((n - 1) * (n - 1)) % mod;
        for (int i = 2; i < n; i++) {
            res = (res + (((n - i) * (n - i)) % mod) * i) % mod;
        }
        System.out.println(res);
    }
}

```

8. 

```java
package guoSai_2019_10th;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 8、大胖子走迷宫
 * 本题总分：20 分
 * <p>
 * 【问题描述】
 * 小明是个大胖子，或者说是个大大胖子，如果说正常人占用 1 × 1 的面积，小明要占用 5 × 5 的面积。
 * 由于小明太胖了，所以他行动起来很不方便。当玩一些游戏时，小明相比小伙伴就吃亏很多。
 * 小明的朋友们制定了一个计划，帮助小明减肥。计划的主要内容是带小明
 * 玩一些游戏，让小明在游戏中运动消耗脂肪。走迷宫是计划中的重要环节。
 * 朋友们设计了一个迷宫，迷宫可以看成是一个由 n × n 个方阵组成的方阵，
 * 正常人每次占用方阵中 1 × 1 的区域，而小明要占用 5 × 5 的区域。小明的位置定义为小明最正中的一个方格。迷宫四周都有障碍物。
 * 为了方便小明，朋友们把迷宫的起点设置在了第 3 行第 3 列，终点设置在了第 n-2 行第 n-2 列。
 * 小明在时刻 0 出发，每单位时间可以向当前位置的上、下、左、右移动单位 1 的距离，也可以停留在原地不动。
 * 小明走迷宫走得很辛苦，
 * 如果他在迷宫里面待的时间很长，则由于消耗了很多脂肪，他会在时刻 k 变成一个胖子，只占用 3 × 3 的区域。
 * 如果待的时间更长，他会在时刻 2k 变成一个正常人，只占用 1 × 1 的区域。
 * 注意，当小明变瘦时迷宫的起点和终点不变。
 * 请问，小明最少多长时间能走到迷宫的终点。注意，小明走到终点时可能变瘦了也可能没有变瘦。
 * 【输入格式】
 * 输入的第一行包含两个整数 n, k。
 * 接下来 n 行，每行一个由 n 个字符组成的字符串，字符为 + 表示为空地，字符为 * 表示为阻碍物。
 * 【输出格式】
 * 输出一个整数，表示答案。
 * 【样例输入】
 * 9 5
 * +++++++++
 * +++++++++
 * +++++++++
 * +++++++++
 * +++++++++
 * ***+*****
 * +++++++++
 * +++++++++
 * +++++++++
 * 【样例输出】
 * 16
 * 【评测用例规模与约定】
 * 对于 30% 的评测用例，1 ≤ n ≤ 50。
 * 对于 60% 的评测用例，1 ≤ n ≤ 100。
 * 对于所有评测用例，1 ≤ n ≤ 300，1 ≤ k ≤ 1000。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:39
 */
public class No8_大胖子走迷宫 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int k;
    static char[][] map;
    static boolean[][] visited;
    /**
     * 起点;终点
     */
    static int sx = 2, sy = 2, ex, ey;
    static int ans;

    public static void main(String[] args) {
        // 数据读取
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        map = new char[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = sc.nextLine().toCharArray();
        }
        ey = ex = n - 3;

        // 数据处理
        bfs();
        System.out.println(ans);
    }

    public static void bfs() {
        Queue<int[]> queue = new LinkedList<>();
        // 将初始节点放入队列
        visited[sx][sy] = true;
        queue.add(new int[]{sx, sy, 0});

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            // 当前节点的位置满足条件，则输出当前节点中记录的位置
            if (node[0] == ex && node[1] == ey) {
                ans = node[2];
                break;
            }

            // 直接将站着不动的情况放入队列
            queue.add(new int[]{node[0], node[1], node[2] + 1});

            for (int z = 0; z < 4; z++) {
                int x = node[0] + dx[z];
                int y = node[1] + dy[z];
                // 当前时刻是什么胖子
                int fat = 0;
                if ((node[2] / k) == 0) {
                    // 5*5
                    fat = 2;
                } else if ((node[2] / k) == 1) {
                    // 3*3
                    fat = 1;
                }

                //是否出边界
                if (0 > x - fat || x + fat >= n || 0 > y - fat || y + fat >= n) {
                    continue;
                }
                //判断是否访问过
                if (visited[x][y]) {
                    continue;
                }

                //计算是否能走到下一个格子
                boolean flag = false;
                if (fat != 0) {
                    for (int i = x - fat; i <= x + fat; i++) {
                        for (int j = y - fat; j <= y + fat; j++) {
                            if (map[i][j] != '+') {
                                flag = true;
                                break;
                            }
                        }
                    }
                } else {
                    if (map[x][y] != '+') {
                        flag = true;
                    }
                }
                if (flag) {
                    continue;
                }

                //放入节点
                visited[x][y] = true;
                queue.add(new int[]{x, y, node[2] + 1});
            }
        }
    }
}

```

9. 

```java
package guoSai_2019_10th;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9、估计人数
 * 本题总分：25 分
 * <p>
 * 【问题描述】
 * 给定一个 N × M 的方格矩阵，矩阵中每个方格标记 0 或者 1 代表这个方格是不是有人踩过。
 * 已知一个人可能从任意方格开始，之后每一步只能向右或者向下走一格。
 * 走了若干步之后，这个人可以离开矩阵。这个人经过的方格都会被标记为 1，
 * 包括开始和结束的方格。注意开始和结束的方格不需要一定在矩阵边缘。
 * 请你计算至少有多少人在矩阵上走过。
 * 【输入格式】
 * 输入第一行包含两个整数 N、M。
 * 以下 N 行每行包含 M 个整数 (0/1)，代表方格矩阵。
 * 【输出格式】
 * 输出一个整数代表答案。
 * 【样例输入】
 * 5 5
 * 00100
 * 11111
 * 00100
 * 11111
 * 00100
 * 【样例输出】
 * 3
 * 【数据规模与约定】
 * 对于所有评测用例，1 ≤ N, M ≤ 20，标记为 1 的方格不超过 200 个。
 *
 * @author Y_Kevin
 * @date 2020-11-09 20:40
 */
public class No9_估计人数 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int m;
    static char[][] data;
    static int[][] idx;
    static int V = 1;
    static boolean[][] graph;
    /**
     * 表示第二个集合中的每个点是否已经被遍历过
     */
    static boolean[] marked;
    /**
     * 存储第二个集合中的每个点当前匹配的第一个集合中的点是哪个
     */
    static int[] source;

    public static void main(String[] args) {
        // 数据读取
        n = sc.nextInt();
        m = sc.nextInt();
        data = new char[n][m];
        idx = new int[n + 1][m + 1];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextLine().toCharArray();
        }
        // 数据处理
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (data[i][j] == '1') {
                    idx[i][j] = V++;
                }
            }
        }

        graph = new boolean[V][V];
        marked = new boolean[V];
        source = new int[V];
        int v;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (idx[i][j] > 0) {
                    v = idx[i][j];
                    if (idx[i + 1][j] > 0) {
                        graph[v][idx[i + 1][j]] = true;
                    }
                    if (idx[i][j + 1] > 0) {
                        graph[v][idx[i][j + 1]] = true;
                    }
                }
            }
        }
        for (int k = 1; k < V; k++) {
            for (int i = 1; i < V; i++) {
                for (int j = 1; j < V; j++) {
                    graph[i][j] |= graph[i][k] & graph[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(graph));

        int cnt = 0;
        for (int i = 1; i < V; i++) {
            Arrays.fill(marked, false);
            cnt += dfs(i) ? 1 : 0;
        }
        System.out.print(V - cnt - 1);
    }

    public static boolean dfs(int v) {
        for (int i = 1; i < V; i++) {
            if (graph[v][i]) {
                if (marked[i]) {
                    continue;
                }
                marked[i] = true;
                if (source[i] == 0 || dfs(source[i])) {
                    source[i] = v;
                    return true;
                }
            }
        }
        return false;
    }
}
```



10. 

```java

```

