#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int king = 1; int quien = 1; int look = 2; int bisop = 2; int knight = 2; int pon = 8;
	int k = 0; int q = 0; int l = 0; int b = 0; int kn = 0; int p = 0;
	scanf("%d %d %d %d %d %d", &k, &q, &l, &b, &kn, &p);
	int A = king - k; int B = quien - q; int C = look - l; int D = bisop - b; int E = knight - kn;
	int F = pon - p;
	printf("%d %d %d %d %d %d", A, B, C, D, E, F);
	return 0;
}
