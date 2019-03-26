import All from './components/index';
import Artists from './components/Artists';
import Albums from './components/Albums';
import Songs from './components/Songs';
import api from './utils/api/api-actions';
import events from './utils/events/event-actions';


// import '../css/styles.css'

main()

function main() {
    api.getRequest('/all', all => {
        console.log(all)
        getAppContext().innerHTML = All(all);
    })

    events.on(getAppContext(), 'click', () => {
        if (event.target.classList.contains('add-artist__submit')) {
            const firstName = document.querySelector('.add-artist__first-name').value
            const lastName = document.querySelector('.add-artist__last-name').value
            const artistImage = document.querySelector('.add-artist__image').value
            const age = document.querySelector('.add-artist__age').value
            const hometown = document.querySelector('.add-artist__hometown').value
            const rating = document.querySelector('.add-artist__rating').value

            api.postRequest('/artists/add', {
                firstName: firstName,
                lastName: lastName,
                artistImage: artistImage,
                age: age,
                hometown: hometown,
                rating: rating
            }, (artists) => getAppContext().innerHTML = Artists(artists))

        }

    })

    events.on(getAppContext(), 'click', () => {
        if (event.target.classList.contains('nav__menu__artists')) {
            api.getRequest('/artists', artists => {
                getAppContext().innerHTML = Artists(artists);
            })
        }
    })

    events.on(getAppContext(), 'click', () => {
        if (event.target.classList.contains('nav__menu__albums')) {
            api.getRequest('/albums', albums => {
                getAppContext().innerHTML = Albums(albums);
            })
        }
    })

    events.on(getAppContext(), 'click', () => {
        if (event.target.classList.contains('nav__menu__songs')) {
            api.getRequest('/songs', songs => {
                getAppContext().innerHTML = Songs(songs);
            })
        }
    })


        function getAppContext() {
            return document.querySelector("#app")
        }

   
}