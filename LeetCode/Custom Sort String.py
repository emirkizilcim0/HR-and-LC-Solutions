class Solution:
    def customSortString(self, order: str, s: str) -> str:
        counts = dict()
        for i in s:
            counts[i] = counts.get(i , 0) + 1
        res = ""
        keys = list(counts.keys())

        #ordering as wanted.
        for letter in order:
            if letter in s:
                while counts[letter] != 0:
                    res += letter
                    counts[letter] -= 1
                if counts[letter] == 0:
                    del counts[letter]
        
        #adding left letters.
        updatedKeys = list(counts.keys())
        for i in range(len(updatedKeys)):
            while counts[updatedKeys[i]] != 0:
                res += updatedKeys[i]
                counts[updatedKeys[i]] -= 1

        return res
    

a = Solution()
print(a.customSortString(order = "cba", s = "abcd" ))
print(a.customSortString(order = "bcafg", s = "abcd" ))