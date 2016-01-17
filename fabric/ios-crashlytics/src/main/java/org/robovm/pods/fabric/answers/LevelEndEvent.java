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

public final class LevelEndEvent extends AnswersEvent<LevelEndEvent> {
    protected String levelName;
    protected NSNumber score;
    protected NSNumber levelCompletedSuccesfully;
    
    public LevelEndEvent putLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }
    
    public LevelEndEvent putScore(Number score) {
        this.score = NSNumber.valueOf(score);
        return this;
    }

    public LevelEndEvent putSuccess(boolean success) {
        this.levelCompletedSuccesfully = NSNumber.valueOf(success);
        return this;
    }
}
