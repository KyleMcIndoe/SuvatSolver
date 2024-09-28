import kotlin.math.sqrt

public abstract class funcs {

    fun swithoutu(v: Double, a: Double, t: Double): Double {
        return (v * t) - (0.5 * (a * (t * t)));
    }

    fun swithoutv(u: Double, a: Double, t: Double): Double {
        return (u * t) + (0.5 * (a * (t * t)));
    }

    fun swithouta(u: Double, v: Double, t: Double): Double {
        return (t / 2) * (u + v);
    }

    fun swithoutt(u: Double, v: Double, a: Double): Double {
        return ((u * u) + (v * v)) / (2 * a);
    }

    fun uwithouts(v: Double, a: Double, t: Double): Double {
        return v - (a * t);
    }

    fun uwithoutv(s: Double, a: Double, t: Double): Double {
        return (s - (a * (t * t))) / (t * t);
    }

    fun uwithouta(s: Double, v: Double, t: Double): Double {
        return ((s * 2) / t) + v;
    }

    fun uwithoutt(s: Double, v: Double, a: Double): Double {
        return sqrt((2 * a * s) - (v * v));
    }

    fun vwithouts(u: Double, a: Double, t: Double): Double {
        return u + (a * t);
    }

    fun vwithoutu(s: Double, a: Double, t: Double): Double {
        return (s + (a * (t * t))) / (2 * t);
    }

    fun vwithouta(s: Double, u: Double, t: Double): Double {
        return ((2 * s) / t) - u;
    }

    fun vwithoutt(s: Double, u: Double, a: Double): Double {
        return sqrt((u * u) + (2 * a * s));
    }

    fun awithouts(u: Double, v: Double, t: Double): Double {
        return (v - u) / t;
    }

    fun awithoutu(s: Double, v: Double, t: Double): Double {
        return (2 * ((v * t) - s)) / (t * t);
    }

    fun awithoutv(s: Double, u: Double, t: Double): Double {
        return (2 * (s - (u * t))) / (t * t);
    }

    fun awithoutt(s: Double, u: Double, v: Double): Double {
        return ((v * v) - (u * u)) / (2 * s);
    }

    fun twithouts(u: Double, v: Double, a: Double): Double {
        return (v - u) / a;
    }

    fun twithoutu(s: Double, v: Double, a: Double): Double {
        return (v - sqrt(( v * v) - (2 * a * s))) / a;
    }

    fun twithoutv(s: Double, u: Double, a: Double): Double {
        return (sqrt((2 * a * s) + (u * u)) - u) / a;
    }

    fun twithouta(s: Double, u: Double, v: Double): Double {
        return (2 * s) / (v + u);
    }


    fun findMissings(s: Double?, u: Double?, v: Double?, a: Double?, t: Double?) {



    }
}