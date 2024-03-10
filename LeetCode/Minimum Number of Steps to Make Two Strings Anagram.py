class Solution:
    def minSteps(self, s: str, t: str) -> int:
        s_counts, t_counts = dict(), dict()
        for i in s:
            s_counts[i] = s_counts.get(i,0) + 1
        for i in t:
            t_counts[i] = t_counts.get(i,0) + 1

        s_keys, t_keys = list(s_counts.keys()), list(t_counts.keys())
        s_values, t_values = list(s_counts.values()), list(t_counts.values())
        res = 0
        indx = 0
        print(t_keys,s_keys)
        while True: #until they are equal.
            if indx == min(len(t_keys),len(s_keys)):
                break
            if t_keys[indx] not in s_keys:
                res += t_values[indx]
            else:
                pass
            indx += 1
        return res
    
a = Solution()
print(a.minSteps(s = "bab", t = "aba"))
print(a.minSteps(s = "leetcode", t = "practice"))
print(a.minSteps(s = "anagram", t = "mangaar"))