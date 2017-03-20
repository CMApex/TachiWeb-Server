/*
 * Copyright 2016 Andy Bao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.kanade.tachiyomi;

import xyz.nulldev.androidcompat.res.RCompat;

/**
 * Fake resource reference class.
 */
public class R extends RCompat {
    public static class string {
        public static int app_name = RCompat.sres("TachiWeb");
        public static int reading = RCompat.sres("Reading");
        public static int completed = RCompat.sres("Completed");
        public static int dropped = RCompat.sres("Dropped");
        public static int on_hold = RCompat.sres("On hold");
        public static int plan_to_read = RCompat.sres("Plan to read");

        public static int download_queue_error = RCompat.sres("An error occurred while downloading chapters. You can try again in the downloads section");
        public static int download_notifier_text_only_wifi = RCompat.sres("No wifi connection available");
        public static int download_notifier_no_network = RCompat.sres("No network connection available");
    }
}