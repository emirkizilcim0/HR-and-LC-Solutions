class Solution:
    def minimumLength(self, s: str) -> int:
        mustRemove = ""
        while True:
            if s[0] == s[-1]:
                mustRemove = s[0]
                while s[0] == mustRemove:
                   s = s[1:]
                   print("first while: " ,s)
                   if len(s) == 0:
                        return 0
                while s[-1] == mustRemove:
                    s = s[:-1]
                    print("second while: " ,s)
                    if len(s) == 0:
                        return 0
            else:
                break    
        return len(s)
    

a = Solution()
print(a.minimumLength(s = "cabaabac"))