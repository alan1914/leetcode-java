# 3. Longest Substring Without Repeating Characters

## 题目

Given a string s, find the length of the longest substring without repeating characters.

## Example 1:
```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

## Example 2:

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

## Example 3:

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

## 解题思路

这一题和第 438 题，第 3 题，第 76 题，第 567 题类似，用的思想都是"滑动窗口”。

滑动窗口的右边界不断的右移，只要没有重复的字符，就持续向右扩大窗口边界。
一旦出现了重复字符，就需要缩小左边界，直到重复的字符移出了左边界，然后继续移动滑动窗口的右边界。
以此类推，每次移动需要计算当前长度，并判断是否需要更新最大长度，最终最大的值就是题目中的所求。

## 代码

```java
   public int lengthOfLongestSubstring(String s) {
  
          if (s.length() == 0) {
              return 0;
          }
  
          int max = 0;
          HashMap<Character, Integer> map = new HashMap<>();
  
          for (int i = 0, j = 0; i < s.length(); i++) {
  
              if (map.containsKey(s.charAt(i))) {
                  j = Math.max(j, map.get(s.charAt(i)) + 1);
              }
  
              // 核心，录入map
              map.put(s.charAt(i), i);
  
              max = max > i - j ? max : i - j + 1;
          }
  
          return max;
```