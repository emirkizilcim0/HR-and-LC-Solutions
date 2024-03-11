def spin_words(sentence):
    # Your code goes here
    word_in_sentence = sentence.split(" ")
    result = ""
    for word in word_in_sentence:
        if len(word) >= 5:
            word = word[::-1]
        result += word + " "
    return result.rstrip()
