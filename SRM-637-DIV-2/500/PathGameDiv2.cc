
// {{{ $VIMCODER$ <-----------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <limits>
#include <list>
#include <map>
#include <memory>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

using namespace std;

// }}}

#define ZERO(a) memset(a, 0, sizeof(a))
#define FOR(x,to) for(x=0;x<to;++x)
#define ITR(x,c) for(__typeof(c.begin()) x=c.begin();x!=c.end();++x)

class PathGameDiv2
{
public:
    int N;
    int flip(int row) {
        return row == 0 ? 1 : 0;
    }

    int walk(vector<string>& bd, int r, int c) {
        if(c == N - 1) {
            return 1;
        }

        // Visit here
        char prev = bd[r][c];
        bd[r][c] = 'v';

        int path = 1 << 20;
        if(bd[r][c+1] == '.')
            path = walk(bd, r, c+1);
        else
            path = walk(bd, flip(r), c);

        bd[r][c] = prev;

        return 1 + path;
    }

    int calc(vector <string> board)
    {
        N = board[0].size();
        int curBlack = 0;
        for(size_t i = 0; i < board.size(); ++i) {
            for(size_t j = 0; j < board[i].size(); ++j) {
                if(board[i][j] == '#') ++curBlack;
            }
        }
        cout << "curBlack = " << curBlack << endl;

        int sp = 1<<20;
        if(board[0][0] == '.') sp = walk(board,0,0);
        if(board[1][0] == '.') sp = min(sp, walk(board,1,0));

        return 2*N - sp - curBlack;
    }
};

