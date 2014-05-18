
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

class ExtraordinarilyLarge
{
public:
    string compare(string x, string y)
    {
        int xFact = removeAndCountFacts(x);
        int yFact = removeAndCountFacts(y);
        int xInt = atoi(x.c_str());
        int yInt = atoi(y.c_str());

        while(xInt <= 12 && xFact) {
            xInt = fact(xInt);
            xFact--;
        }

        while(yInt <= 12 && yFact) {
            yInt = fact(yInt);
            yFact--;
        }

        if(xFact > yFact) return "x>y";
        if(xFact < yFact) return "x<y";
        if(xInt < yInt)  return "x<y";
        if(xInt > yInt) return "x>y";
        return "x=y";
    }

    int removeAndCountFacts(string &x) {
        size_t pos = 0;
        while(pos < x.size() && x[pos] != '!') {
            pos++;
        }

        x[pos] = '\0';
        return x.size() - pos;
    }

    int fact(int n) {
        if(n == 0)
            return 1;
        return n * fact(n-1);
    }
};

