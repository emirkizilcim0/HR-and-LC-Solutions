def halvesAreAlike(s: str) -> bool:
    vowels_first_half, vowels_second_half =  dict(), dict()
    middle = len(s)//2
    first_half = s[:middle]
    second_half = s[middle:]
    for i in first_half:
        if i in "aeiouAEIOU":
            vowels_first_half[i] = vowels_first_half.get(i,0) + 1
    for i in second_half:
        if i in "aeiouAEIOU":
            vowels_second_half[i] = vowels_second_half.get(i,0) + 1
    print(vowels_first_half, vowels_second_half)
    return True if sum(vowels_second_half.values()) == sum(vowels_first_half.values()) else False

#print(halvesAreAlike(s = "book"))
#print(halvesAreAlike(s = "textbook"))
print(halvesAreAlike(s = "AbCdEfGh"))