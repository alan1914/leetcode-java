# 5. Longest Palindromic Substring

## 题目

Given a string s, return the longest palindromic substring in s.

## Example 1:
```
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
```

## Example 2:

```
Input: s = "cbbd"
Output: "bb"
```

## Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.

## 解题思路

这一题和第 438 题，第 3 题，第 76 题，第 567 题类似，用的思想都是"滑动窗口”。

滑动窗口的右边界不断的右移，只要没有重复的字符，就持续向右扩大窗口边界。
一旦出现了重复字符，就需要缩小左边界，直到重复的字符移出了左边界，然后继续移动滑动窗口的右边界。
以此类推，每次移动需要计算当前长度，并判断是否需要更新最大长度，最终最大的值就是题目中的所求。

## 代码

```java
      private int left = 0;
      private int maxLen = 0;
  
      public String longestPalindrome(String s) {
  
          for (int i = 0; i < s.length(); i++) {
              maxPalindrome(s, i, i);
              maxPalindrome(s, i, i + 1);
          }
  
          return s.substring(left, left + maxLen + 1);
      }
  
      private void maxPalindrome(String s, int i, int j) {
  
          while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
              i--;
              j++;
          }
  
          if (j - 1 - (i + 1) > maxLen) {
              left = i + 1;
              maxLen = j - 1 - (i + 1);
          }
  
      }

```