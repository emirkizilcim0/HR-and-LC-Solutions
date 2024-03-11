public class SpinWords {

    public String spinWords(String sentence) {
      //TODO: Code stuff here
      String[] words = sentence.split("\\W+");
      String result = "";
      for(String word : words){
        if(word.length() >= 5)
            word = new StringBuffer(word).reverse().toString();
        result += word + " ";
      }
      return result.trim();
    }
  }