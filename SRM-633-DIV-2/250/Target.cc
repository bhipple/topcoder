
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

class Target
{
public:
    vector <string> box;
    int N;

    vector <string> draw(int n)
    {
        N = n;
        setupBox();
        boxHere(0, N-1, 0, N-1);

        return box;
    }

    void setupBox() {
        stringstream ss;
        for(int i = 0; i < N; ++i) {
            ss << " ";
        }
        string def = ss.str();

        for(int i = 0; i < N; ++i) {
            box.push_back(def);
        }
    }

    void boxHere(int startRow, int endRow, int startCol, int endCol) {
        if(startRow > endRow || startCol > endCol) {
            return;
        }

        for(int i = startRow; i <= endRow; ++i) {
            box[i][startCol] = '#';
            box[i][endCol] = '#';
        }
        for(int i = startCol; i <= endCol; ++i) {
            box[startRow][i] = '#';
            box[endRow][i] = '#';
        }

        boxHere(startRow + 2, endRow - 2, startCol + 2, endCol - 2);
    }
};

