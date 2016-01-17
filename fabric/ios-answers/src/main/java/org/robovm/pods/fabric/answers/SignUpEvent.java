/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.fabric.answers;

import org.robovm.apple.foundation.NSNumber;

public final class SignUpEvent extends AnswersEvent<SignUpEvent> {
    protected String signUpMethod;
    protected NSNumber signUpSucceeded;

    public SignUpEvent putMethod(String signUpMethod) {
        this.signUpMethod = signUpMethod;
        return this;
    }

    public SignUpEvent putSuccess(boolean signUpSucceeded) {
        this.signUpSucceeded = NSNumber.valueOf(signUpSucceeded);
        return this;
    }
}
