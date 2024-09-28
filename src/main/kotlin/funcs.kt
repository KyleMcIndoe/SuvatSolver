import kotlin.math.sqrt

public class funcs {

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


    public fun findMissings(si: Double?, ui: Double?, vi: Double?, ai: Double?, ti: Double?): Array<Double> {
        val suvatLetters = arrayOf("s", "u", "v", "a", "t");
        var argsArr = arrayOf(si, ui, vi, ai, ti);
        var unknownIndices = arrayOf(6, 6);

        var letterOne = "";
        var letterTwo = "";

        val s: Double = si ?: 0.0;
        val u: Double = ui ?: 0.0;
        val v: Double = vi ?: 0.0;
        val a: Double = ai ?: 0.0;
        val t: Double = ti ?: 0.0;

        var i = 0;
        while(i < 5) {
            if(argsArr[i] == null && letterOne == "") {
                letterOne = suvatLetters[i];
                unknownIndices[0] = i;
            }
            if(argsArr[i] == null && letterOne != "") {
                letterTwo = suvatLetters[i];
                unknownIndices[1] = i;
            }
            i++;
        }

        val funcNameOne = letterOne + "without" + letterTwo;
        val funcNameTwo = letterTwo + "without" + letterOne;

        fun callFromString(x: String): Double {
            if(x == "swithoutu") return swithoutu(v, a, t);
            if(x == "swithoutv") return swithoutv(u, a, t);
            if(x == "swithouta") return swithouta(u, v, t);
            if(x == "swithoutt") return swithoutt(u, v, a);
            if(x == "uwithouts") return uwithouts(v, a, t);
            if(x == "uwithoutv") return uwithoutv(s, a, t);
            if(x == "uwithouta") return uwithouta(s, v, t);
            if(x == "uwithoutt") return uwithoutt(s, v, a);
            if(x == "vwithouts") return vwithouts(u, a, t);
            if(x == "vwithoutu") return vwithoutu(s, a, t);
            if(x == "vwithouta") return vwithouta(s, u, t);
            if(x == "vwithoutt") return vwithoutt(s, u, a);
            if(x == "awithouts") return awithouts(u, v, t);
            if(x == "awithoutu") return awithoutu(s, v, t);
            if(x == "awithoutv") return awithoutv(s, u, t);
            if(x == "awithoutt") return awithoutt(s, u, v);
            if(x == "twithouts") return twithouts(u, v, a);
            if(x == "twithoutu") return twithoutu(s, v, a);
            if(x == "twithoutv") return twithoutv(s, u, a);
            if(x == "twithouta") return twithouta(s, u, v);

            return 0.0;
        }

        var answers = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0);

        i = 0;
        while(i < 5) {
            if(i == unknownIndices[0]) {
                answers[i] = callFromString(funcNameOne);
            } else if(i == unknownIndices[1]) {
                answers[i] = callFromString(funcNameTwo);
            } else {
                answers[i] = argsArr[i] ?: 0.0;
            }
            i++;
        }

        return answers;
    }
}