"""
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true
"""


def solve(s: str, t: str):
    s_len, t_len = len(s), len(t)
    if s_len != t_len:
        return False

    mapS = {}
    mapT = {}

    for i in range(s_len):
        mapS[s[i]] = mapS.get(s[i], 0) + 1
        mapT[t[i]] = mapT.get(t[i], 0) + 1

    for e in mapS:
        if mapS[e] != mapT.get(e, 0):
            return False
    return True
