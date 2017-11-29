/*
 * Copyright (C) 2016 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http//www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fdroid.fdroid.privileged;

import android.util.Pair;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Only apps signed using a certificate with a SHA-256 hash listed here
 * can access the Privileged Extension!
 * 1. Get SHA-256 of certificate with
 * keytool -list -printcert -jarfile com.example.apk
 * 2. Add here as lowercase without colons
 */
public class ClientWhitelist {

    //keytool -list -v -keystore keystore.jks -alias key0 -storepass password -keypass password | grep 'SHA256:' | tr -d ':' | cut -d' ' -f 3
    public static HashSet<Pair<String, String>> whitelist = new HashSet<>(Arrays.asList(
            // certificate SHA-256 of https//f-droid.org/FDroid.apk
            new Pair<>("org.fdroid.fdroid", "43238d512c1e5eb2d6569f4a3afbf5523418b82e0a3ed1552770abb9a9c9ccab"),
            new Pair<>("org.fdroid.fdroid", "19febe0ed4b9d8fcc91271c7182fb9e510ef57749f56b07e1ee1c1bdafc5a2ab"), // key used to build Fdroid :: Hernand
            new Pair<>("org.fdroid.fdroid", "275e76d61df2d2237e985b4aaf30d691de90bd2fa25e404728a9b87393a13e3c") // key used to build Fdroid :: Hernand emile using froid keystore

    ));

}
