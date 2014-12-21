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
        boxIt(n);

        return box;
    }

    void boxIt(int n) {
        if(n == 1) {
            string center = "#";
            box.push_back(center);
            return;
        }
        boxIt(n-1);

        char c;
        if(n % 2 == 0) {
            c = ' ';
        } else {
            c = '#';
        }
        for(int i = 0; i < box.size(); ++i) {
            box[i] = c + box[i] + c;
        }
        stringstream ss;
        for(int i = 0; i < n; ++i) {
            ss << c;
        }
        string line = ss.str();
        box.push_back(line);
        box.insert(box.begin(), line);
    }

};


