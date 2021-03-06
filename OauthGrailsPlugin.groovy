
/*
 * Copyright 2008 the original author or authors.
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

class OauthGrailsPlugin {
    
    def version = 0.13
    def dependsOn = [:]
    def author = "Yong Rong (Damien) Hou, Anthony Campbell, Antony Jones (Desirable Objects)"
    def authorEmail = "houyongr [[at] gmail [dot]] com, acampbell3000 [[at] gmail [dot]] com, aj [[at] desirableobjects [dot] co [dot]] uk"
    def title = "Adds OAuth capability to Grails apps"
    def description = '''Wraps up the Signpost OAuth Java implementation and provides out-of-the-box
	OAuth functionality for Grails appplications.'''

    def documentation = "http://www.grails.org/plugin/oauth"
    
    def onConfigChange = { event ->
        final def oauthService = event?.ctx?.getBean("oauthService")
        oauthService?.reset()
    }
	
}
