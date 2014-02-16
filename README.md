# lein-script

A Leiningen template for creating project-free scripts in Clojure.

## Setup

Add the latest `lein-exec` and `lein-script` to your
`.lein/profiles.clj`:

<img src="https://clojars.org/lein-exec/latest-version.svg">
<img src="https://clojars.org/lein-script/latest-version.svg">

e.g.,

    {:user {:plugins [[lein-script "0.0.4"]
                      [lein-exec "0.3.1"]]}}

## Usage

    $ lein new script foo
    Generating stand-alone script "foo".
    $ ./foo
    Welcome to foo!

You can easily add dependencies in the generated script by uncommenting the appropriate code within.

## See also:

1. [lein-exec](https://github.com/kumarshantanu/lein-exec)
1. [Dead simple scripts in Clojure](http://eigenhombre.com/2014/02/16/dead-simple-one-file-scripts-in-clojure/)

## License

Copyright © 2014 John Jacobsen.  MIT License (see LICENSE).

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
