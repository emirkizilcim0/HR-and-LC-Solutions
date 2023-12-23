class FoodRatings:

    def __init__(self, foods, cuisines, ratings):
        self.dic_foods_cuisenes, self.dic_foods_ratings = {}, {}
        for i in range(len(foods)):
            self.dic_foods_cuisenes[foods[i]] = cuisines[i]
            self.dic_foods_ratings[foods[i]] = ratings[i]

    def changeRating(self, food: str, newRating: int) -> None:
        self.dic_foods_ratings[food] = newRating

    def highestRated(self, cuisine: str) -> str:
        cousines = list(self.dic_foods_cuisenes.values())
        ratings = list(self.dic_foods_ratings.values())
        food_name = list(self.dic_foods_cuisenes.keys())
        food_ratings = {}
        for i in range(len(cousines)):
            if cousines[i] == cuisine:
                food_ratings[food_name[i]] = ratings[i]
        ratings_related = list(food_ratings.values())
        foods_related = list(food_ratings.keys())
        if ratings_related.count(max(ratings_related)) > 1:
            names = []
            for i in range(len(ratings_related)):
                if ratings_related[i] == max(ratings_related):
                    names.append(foods_related[i])
            return min(names)
        else:
            the_max_index = ratings_related.index(max(ratings_related))
        return foods_related[the_max_index]