def is_solved(board):
    x_won = False
    o_won = False
    draw = True
    
    # Row check
    for i in range(3):
        if board[i][0] == board[i][1] and  board[i][1] == board[i][2]:
            if board[i][i] == 1:
                x_won = True
            elif board[i][i] == 2:
                o_won = True
    print(x_won, o_won) 
    if x_won:
        return 1
    if o_won:
        return 2
                
    # Column check
    for i in range(3):
        if board[0][i] == board[1][i] and  board[1][i] == board[2][i]:
            if board[i][i] == 1:
                x_won = True
            elif board[i][i] == 2:
                o_won = True
    print(x_won, o_won)
    if x_won:
        return 1
    if o_won:
        return 2
    
    # Diagonal Check
    if board[0][0] == board[1][1] and  board[1][1] == board[2][2]:
        if board[i][i] == 1:
            x_won = True
        elif board[i][i] == 2:
            o_won = True

    if board[1][1] == board[2][0] and board[0][2] == board[1][1]:
        if board[0][2] == 1:
            x_won = True
        elif board[0][2] == 2:
            o_won = True       
    print(x_won, o_won)
    if x_won:
        return 1
    if o_won:
        return 2
    
    # Check if the game is not over
    zeros = 0
    for i in range(3):
        for j in range(3):
            if board[i][j] == 0:
                zeros += 1
    
    if zeros >= 3:
        return -1
    print(x_won, o_won)
    # if everythings false. then draw.
    if draw:
        return 0
    

if __name__ == "__main__":

    board = [[2,2,2],
            [0,1,1],
            [1,0,0]]

    print(is_solved(board))