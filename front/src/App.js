import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';

class App extends Component {
    constructor(props) {
      super(props);

      this.state = {movies: []};
      /*this.state = {
         //movies:
         [
             {
                     "_id" : "ObjectId(59eef692d0be376dbe31f0f0)",
                     "title" : "Shawshank Redemption",
                     "category" : "Drama",
                     "mainActor" : "Tim Robbins",
                     "releaseDate" : "ISODate(1995-02-09T23:00:00Z)"
             },
             {
                     "_id" : "ObjectId(59eef692d0be376dbe31f0f1)",
                     "_class" : "ch.homegate.beans.Movie",
                     "title" : "The Godfather I",
                     "category" : "Crime, Drama",
                     "mainActor" : "Marlon Brando",
                     "releaseDate" : "ISODate(1973-12-02T23:00:00Z)"
             },
             {
                     "_id" : "ObjectId(59eef692d0be376dbe31f0f2)",
                     "_class" : "ch.homegate.beans.Movie",
                     "title" : "The Godfather II",
                     "category" : "Drama",
                     "mainActor" : "Marlon Brando",
                     "releaseDate" : "ISODate(1975-08-11T23:00:00Z)"
             }
         ]
      }*/
   }

   componentDidMount() {
       this.MovieList();
     }

     MovieList() {
           axios.get(this.props.url + "/movies")
             .then(response => {
                           this.setState({movies: response.data._embedded.movies});
                         });
         }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>

        <table class="tg">
            <tbody>
                <tr>
                    <th class="tg-l2oz">ID</th>
                    <th class="tg-9hbo">Title</th>
                    <th class="tg-9hbo">Category</th>
                    <th class="tg-9hbo">Release Date</th>
                    <th class="tg-9hbo">Main actor</th>
                    <th class="tg-9hbo">Preview</th>
                </tr>
              {this.state.movies.map((movie, i) => <TableRow key = {i}
                 movies = {movie} />)}
            </tbody>
        </table>
      </div>
    );
  }
}

class TableRow extends React.Component {
   render() {
      return (
          <tr>
             <td class="tg-6k2t">{this.props.movies._id}</td>
             <td class="tg-6k2t">{this.props.movies.title}</td>
             <td class="tg-6k2t">{this.props.movies.category}</td>
             <td class="tg-6k2t">{this.props.movies.releaseDate}</td>
             <td class="tg-6k2t">{this.props.movies.mainActor}</td>
             <td class="tg-6k2t">{this.props.movies.preview}</td>
           </tr>
      );
   }
}

export default App;
