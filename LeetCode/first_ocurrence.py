def strStr(haystack,needle):
    res = 0
    if needle in haystack:
        newstr = haystack.split(needle)
        print(newstr)
        res = len(newstr[0])
        print(res)
        return res
    return -1

print(strStr(haystack = "sadbutsad", needle = "sad"))