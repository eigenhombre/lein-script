# lein-script

A Leiningen template for creating project-free scripts in Clojure.

You must add [lein-exec](https://github.com/kumarshantanu/lein-exec) to `.lein/profiles.clj` before running scripts that this plugin generates.

Example:

    lein new script foo
    ./foo

You can easily add dependencies in the generated script by uncommenting the appropriate code within.

## License

Copyright © 2014 John Jacobsen.  MIT License (see LICENSE).

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
