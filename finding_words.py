def countCharacters(words, chars):
    res = 0
    for word in words:
        char_in_list = [char for char in chars]
        temp_chars = char_in_list
        success = 0
        for i in range(len(word)):
            if word[i] in temp_chars:
                success += 1
                temp_chars.remove(word[i])
        if success == len(word):
            res += len(word)
    return res


print(countCharacters(words = ["cat","bt","hat","tree"], chars = "atach"))