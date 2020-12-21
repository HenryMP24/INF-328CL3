<%@ Page Title="" Language="C#" MasterPageFile="~/app/Site1.Master" AutoEventWireup="true" CodeBehind="agregar.aspx.cs" Inherits="academicowebs.app.agregar" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="ContentPlaceHolder1" runat="server">
    <asp:Label ID="Label1" runat="server" Text="ANOTAR UNA NUEVA MATERIA"></asp:Label><br />
    <asp:Label ID="Label2" runat="server" Text="INGRESE LA SIGLA"></asp:Label>
    <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox><br />

    <asp:Label ID="Label3" runat="server" Text="INGRESE EL NOMBRE"></asp:Label>
    <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox><br />


    <asp:Button ID="Button1" runat="server" Text="INGRESAR" OnClick="Button1_Click" />


</asp:Content>
