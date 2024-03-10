def groupAnagrams(strs):
    anagram = dict()
    res = []
    key = ""
    for word in strs:
        key = str(sorted(word))
        if key not in anagram:
            anagram[key] = [word]
        else:
            anagram[key].append(word)
    for value in list(anagram.values()):
        res.append(value)
    return res

print(groupAnagrams(strs = ["eat","tea","tan","ate","nat","bat"]))
#assert groupAnagrams(strs = ["eat","tea","tan","ate","nat","bat"]) == [["bat"],["nat","tan"],["ate","eat","tea"]], "wrong"