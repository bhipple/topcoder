
// {{{ Boilerplate Code <--------------------------------------------------
// vim:filetype=cpp:foldmethod=marker:foldmarker={{{,}}}

#include <algorithm>
#include <bitset>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <deque>
#include <functional>
#include <iomanip>
#include <iostream>
#include <list>
#include <map>
#include <numeric>
#include <queue>
#include <set>
#include <sstream>
#include <stack>
#include <utility>
#include <vector>

#define FOR(I,A,B) for(int I = (A); I < (B); ++I)
#define REP(I,N)   FOR(I,0,N)
#define ALL(A)     (A).begin(), (A).end()

using namespace std;

// }}}

class PairGameEasy
{
public:
    string able(int a, int b, int c, int d)
    {
        return rec(a, b, c, d) ? "Able to generate" : "Not able to generate";
    }

    bool rec(int a, int b, int c, int d) {
        if(a == c && b == d) return true;
        if(a > c || b > d) return false;

        return rec(a+b, b, c, d) || rec(a, a+b, c, d);
    }
};

