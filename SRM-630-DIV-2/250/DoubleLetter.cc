
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

class DoubleLetter
{
public:
    string ableToSolve(string S)
    {
        bool modified = true;
        while(modified) {
            modified = false;
            char last = S[0];
            for(int i = 1; i < S.size(); ++i) {
                if(S[i] == last) {
                    modified = true;
                    S = S.substr(0, i - 1) + S.substr(i+1, S.size());
                    break;
                }
                last = S[i];
            }
        }
        return S == "" ? "Possible" : "Impossible";
    }
};

